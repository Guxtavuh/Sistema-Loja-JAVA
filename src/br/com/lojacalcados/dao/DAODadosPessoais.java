package br.com.lojacalcados.dao;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.lojacalcados.crud.ICR;
import br.com.lojacalcados.pojo.DadosPessoais;

public class DAODadosPessoais extends Conexao implements ICR<DadosPessoais>{

	@Override
	public String create(DadosPessoais obj) {
		String msg = "";
		try {
			if(abrirBanco()) {
				String query = "Insert Into dadospessoais(cpf,datanascimento,sexo)values(?,?,?)";
				
				/*
				 * Para executar a consulta � necessario carrega-la na mem�ria assim usamos o comando prepareStatement
				 * foi aplicado tamb�m o comando Statement.RETURN_GENERATED_KEYS para pegar o id gerado no momento do cadastro
				 * dos dados pessoais
				 */
				pst = cx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
				
				
				pst.setString(1, obj.getCpf());
				pst.setDate(2, (Date) obj.getDataNascimento());
				pst.setString(3,obj.getSexo());
				//Executar o cadastro no banco
				int r = pst.executeUpdate();
				
				
				/*
				 * para guardar o id gerado no momento da inser��o foi usado o comando generated_keys e foi alocado 
				 * na v�rivel result set(rs) a coluna do id da tabela de dados pessoais 
				 * 
				 */
				
				rs = pst.getGeneratedKeys();
				/*
				 * estamos verificando se o r que guarda o resultado do cadastro � maior que zero
				 * e se for ir� retornar  o id gerado do cadastro, o id � do tipo long, (num�rico)
				 * por�m a v�riavel msg � do tipo string
				 * ent�o foi necesario realizar a convers�o de tipos sendo essas de numero.
				 */
				
				if(r>0) {
					if(rs.next()) {
						msg =String.valueOf(rs.getLong(1));
					}
				}
				else 
					msg = "N�o foi poss�vel cadastrar";				
			}else {
				msg = "Erro ao abrir o banco";
			}
		}
		catch(SQLException se) {
			msg = "Erro ao tentar cadastrar -> "+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado -> "+e.getMessage();
		}
		finally {
			fecharBanco();
		}
		return msg;
	}

	@Override
	public DadosPessoais read(DadosPessoais obj) {

		DadosPessoais dp = new DadosPessoais();
		
		try {
			if(abrirBanco()) {
				String query = "SELECT * FROM dadospessoais WHERE cpf=?";
				pst = cx.prepareStatement(query);
				pst.setString(1, obj.getCpf());
				rs = pst.executeQuery();
				if(rs.next()) {
					dp.setIdDadosPessoais(rs.getLong(1));
					dp.setCpf(rs.getString(2));
					dp.setDataNascimento(rs.getDate(3));
					dp.setSexo(rs.getString(4));
				}
				else {
					System.out.println("CPF n�o localizado");
				}
			}
			else {
				System.out.println("Erro ao abrir o banco");
			}
		}
		catch(SQLException se) {
			System.out.println("Erro ao tentar selecionar -> "+se.getMessage());
		}
		catch(Exception e) {
			System.out.println("Erro inesperado -> "+e.getMessage());
		}
		finally {
			fecharBanco();
		}
		return dp;
	}

	@Override
	public List<DadosPessoais> read() {
		
		List<DadosPessoais> lst = new ArrayList<DadosPessoais>();
		
		try {
			if(abrirBanco()) {
				String query = "SELECT * FROM dadospessoais";
				pst = cx.prepareStatement(query);
				rs = pst.executeQuery();
				while(rs.next()) {
					DadosPessoais dp = new DadosPessoais();
					
					dp.setIdDadosPessoais(rs.getLong(1));
					dp.setCpf(rs.getString(2));
					dp.setDataNascimento(rs.getDate(3));
					dp.setSexo(rs.getString(4));
					
					lst.add(dp);
				}
			}
			else {
				System.out.println("Erro ao abrir o banco");
			}
		}
		catch(SQLException se) {
			System.out.println("Erro ao tentar selecionar -> "+se.getMessage());
		}
		catch(Exception e) {
			System.out.println("Erro inesperado -> "+e.getMessage());
		}
		finally {
			fecharBanco();
		}
		return lst;	
	}
	
	
}







