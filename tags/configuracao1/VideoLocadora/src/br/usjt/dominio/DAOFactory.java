package br.usjt.dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe abstrata de conexao com a base
public abstract class DAOFactory {

	private static String JDBC_DRIVER  = "com.mysql.jdbc.Driver";  
    private static String DATABASE_URL = "jdbc:mysql://localhost/videolocadora";  
    private static String LOGIN = "root";  
    private static String PASSWORD  = "";

  // There will be a method for each DAO that can be 
  // created. The concrete factories will have to 
  // implement these methods.
   
	private static Connection conexao;
    
    public static Connection criaConexao() {
    	// socket de conexao
		conexao = null;
		try {
			if (conexao == null || conexao.isClosed()) {
				Class.forName(JDBC_DRIVER);
				// estabelece a conexao com o banco de dados
				conexao = DriverManager.getConnection(DATABASE_URL, LOGIN, PASSWORD);
			}
		} catch (ClassNotFoundException cnfex) {
			// excessoes para driver de conexao nao encontrado sao tratados aqui
			cnfex.printStackTrace();
		} catch (SQLException sqlex) {
			// excessoes do sql sao tratadas aqui
			sqlex.printStackTrace();
		} catch (Exception ex) {
			// process remaining Exceptions here
			ex.printStackTrace();
		}

		return conexao;
    }
//    public static IFilme getFilmeDAO() {
//     
//      return new DAOFilme();
//    }
//    public static IDAOCliente getClienteDAO() {
//      return new DAOCliente();
//    }
    public static IDAOUsuario getUsuarioDAO() {
        return new DAOUsuario();
      }
  }