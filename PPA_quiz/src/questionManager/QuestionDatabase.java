package questionManager;

import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuestionDatabase {
	private static final String url = "jdbc:hsqldb:file:C:\\Users\\dell\\Desktop\\PPA\\hsqldb\\data\\dbquiz";
	Connection connection = null;
	
	public void prepareDatabase() {
        try (Connection c = getConnection(url, "SA", "")) {
            c.createStatement().execute("CREATE TABLE QUESTIONSTABLE (ID VARCHAR(255), QUESTION VARCHAR(500), ANSWER1 VARCHAR(500), ANSWER2 VARCHAR(500), ANSWER3 VARCHAR(500), CORRECT VARCHAR(500), QUIZNAME VARCHAR(255))");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
	public void updateDatabase() {
		try (Connection c = DriverManager.getConnection(url, "SA", "")) {
            try (PreparedStatement ps = c.prepareStatement("INSERT INTO QUESTIONSTABLE (ID, QUESTION, ANSWER1, ANSWER2, ANSWER3, CORRECT, QUIZNAME) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            	ps.setString(1, "Historia1");
            	ps.setString(2, "Chrzest Polski:");
                ps.setString(3, "996");
                ps.setString(4, "966");
                ps.setString(5, "1000");
                ps.setString(6, "966");
                ps.setString(7, "Historia");
                ps.execute();

                ps.setString(1, "Historia2");
            	ps.setString(2, "Koronacja pierwszego kr�la:");
                ps.setString(3, "966");
                ps.setString(4, "1000");
                ps.setString(5, "1025");
                ps.setString(6, "1025");
                ps.setString(7, "Historia");
                ps.execute();  
                
                ps.setString(1, "Historia3");
            	ps.setString(2, "Pocz�tek rozbicia dzielnicowego");
                ps.setString(3, "1138");
                ps.setString(4, "1226");
                ps.setString(5, "1325");
                ps.setString(6, "1138");
                ps.setString(7, "Historia");
                ps.execute();

                ps.setString(1, "Historia4");
            	ps.setString(2, "Bitwa pod Grunwaldem:");
                ps.setString(3, "1400");
                ps.setString(4, "1410");
                ps.setString(5, "1425");
                ps.setString(6, "1410");
                ps.setString(7, "Historia");
                ps.execute();  
                
                ps.setString(1, "Historia5");
            	ps.setString(2, "Ho�d pruski:");
                ps.setString(3, "1254");
                ps.setString(4, "1475");
                ps.setString(5, "1525");
                ps.setString(6, "1525");
                ps.setString(7, "Historia");
                ps.execute();

                ps.setString(1, "Historia6");
            	ps.setString(2, "Konstytucja Trzeciego Maja:");
                ps.setString(3, "1790");
                ps.setString(4, "1791");
                ps.setString(5, "1794");
                ps.setString(6, "1791");
                ps.setString(7, "Historia");
                ps.execute();  
                
                ps.setString(1, "Historia7");
            	ps.setString(2, "Trzeci rozbi�r Polski:");
                ps.setString(3, "1795");
                ps.setString(4, "1791");
                ps.setString(5, "1790");
                ps.setString(6, "1795");
                ps.setString(7, "Historia");
                ps.execute();

                ps.setString(1, "Historia8");
            	ps.setString(2, "Powstanie styczniowe:");
                ps.setString(3, "1860");
                ps.setString(4, "1863");
                ps.setString(5, "1846");
                ps.setString(6, "1863");
                ps.setString(7, "Historia");
                ps.execute(); 
                
                ps.setString(1, "Historia9");
            	ps.setString(2, "Odzyskanie niepodleg�o�ci:");
                ps.setString(3, "1918");
                ps.setString(4, "1914");
                ps.setString(5, "1917");
                ps.setString(6, "1918");
                ps.setString(7, "Historia");
                ps.execute();

                ps.setString(1, "Historia10");
            	ps.setString(2, "Wst�pienie do Unii Europejskiej:");
                ps.setString(3, "2002");
                ps.setString(4, "2004");
                ps.setString(5, "2003");
                ps.setString(6, "2004");
                ps.setString(7, "Historia");
                ps.execute(); 
                
                ps.setString(1, "Neuropsychologia1");
            	ps.setString(2, "Zaburzenie aktualizacji s��w to?");
                ps.setString(3, "Apraksja");
                ps.setString(4, "Anomia");
                ps.setString(5, "Afazja");
                ps.setString(6, "Anomia");
                ps.setString(7, "Neuropsychologia");
                ps.execute(); 
                
                ps.setString(1, "Neuropsychologia2");
            	ps.setString(2, "Obszar Broki i Wernickego ��czy?");
                ps.setString(3, "P�czek �ukowaty");
                ps.setString(4, "P�czek k�towy");
                ps.setString(5, "P�czek pod�u�ny");
                ps.setString(6, "P�czek �ukowaty");
                ps.setString(7, "Neuropsychologia");
                ps.execute(); 
                
                ps.setString(1, "Neuropsychologia3");
            	ps.setString(2, "Intonacja wypowiedzi to?");
                ps.setString(3, "Paralaksja");
                ps.setString(4, "Prozodia");
                ps.setString(5, "Afemia");
                ps.setString(6, "Prozodia");
                ps.setString(7, "Neuropsychologia");
                ps.execute(); 
                
                ps.setString(1, "Neuropsychologia4");
            	ps.setString(2, "Zaburzenia pragmatyki to?");
                ps.setString(3, "Praksja");
                ps.setString(4, "Aleksja");
                ps.setString(5, "Pragnozja");
                ps.setString(6, "Pragnozja");
                ps.setString(7, "Neuropsychologia");
                ps.execute(); 
                
                ps.setString(1, "Neuropsychologia5");
            	ps.setString(2, "Poczucia cia�a, to:");
                ps.setString(3, "Somatestezja");
                ps.setString(4, "Sometopenia");
                ps.setString(5, "Somatetyka");
                ps.setString(6, "Somatestezja");
                ps.setString(7, "Neuropsychologia");
                ps.execute();
                
                ps.setString(1, "Neuropsychologia6");
            	ps.setString(2, "Agnozja otoczenia inaczej to:");
                ps.setString(3, "Topograficzna");
                ps.setString(4, "Lokalna");
                ps.setString(5, "Percepcyjna");
                ps.setString(6, "Topograficzna");
                ps.setString(7, "Neuropsychologia");
                ps.execute();
                
                ps.setString(1, "Neuropsychologia7");
            	ps.setString(2, "Uporczywe powtarzanie ruchu to:");
                ps.setString(3, "Parafazja");
                ps.setString(4, "Perseweracja");
                ps.setString(5, "Paraleksja");
                ps.setString(6, "Perseweracja");
                ps.setString(7, "Neuropsychologia");
                ps.execute();
                
                ps.setString(1, "Neuropsychologia8");
            	ps.setString(2, "System wykonawczy kontroluje:");
                ps.setString(3, "Analiz� odleg�o�ci i g��bi");
                ps.setString(4, "Akcj� serca");
                ps.setString(5, "Zachowanie");
                ps.setString(6, "Zachowanie");
                ps.setString(7, "Neuropsychologia");
                ps.execute();
                
                ps.setString(1, "Neuropsychologia9");
            	ps.setString(2, "Cia�o migda�owate jest w p�acie:");
                ps.setString(3, "Skroniowym");
                ps.setString(4, "Czo�owym");
                ps.setString(5, "Ciemieniowym");
                ps.setString(6, "Skroniowym");
                ps.setString(7, "Neuropsychologia");
                ps.execute();
                
                ps.setString(1, "Neuropsychologia10");
            	ps.setString(2, "Pami�� plan�w to pami��?");
                ps.setString(3, "Prospektywna");
                ps.setString(4, "Semantyczna");
                ps.setString(5, "Autobiograficzna");
                ps.setString(6, "Prospektywna");
                ps.setString(7, "Neuropsychologia");
                ps.execute();
            }

		} catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
    }
	public int getQuestionNumber(String quizname) {
		int cnt = 0;
		Connection connection = null;
		String q = null;
		try {
        	connection = DriverManager.getConnection(url);
            
        	try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM QUESTIONSTABLE WHERE ID LIKE ?")) {
            	ps.setString(1, quizname+"%");
            	
            	ResultSet ResultSet =  ps.executeQuery();
            	while (ResultSet.next()) {
            		cnt++;
                }
            }   
        }
        catch (SQLException exp) {
            System.err.println(exp.getMessage());
        }
		return cnt;
	}
	public String getQuestion(int pytanie, String quizname) {
		Connection connection = null;
		String q = null;
		try {
        	connection = DriverManager.getConnection(url);
        	String sqlquery = ("SELECT * FROM QUESTIONSTABLE WHERE ID=?");
    		PreparedStatement ps = connection.prepareStatement(sqlquery);
    		ps.setString(1, quizname+pytanie);
        	ResultSet ResultSet =  ps.executeQuery();
     
            while(ResultSet.next()) {
            	q = ResultSet.getString("QUESTION");
            } 
        
            ResultSet.close();
            
        }
        catch (SQLException exp) {
            System.err.println(exp.getMessage());
        }
		return q;
	}
	public String getAnswer1(int pytanie, String quizname) {
		Connection connection = null;
		String a1 = null;
		try {
        	connection = DriverManager.getConnection(url);
             
        	String sqlquery = ("SELECT * FROM QUESTIONSTABLE WHERE ID=?");
    		PreparedStatement ps = connection.prepareStatement(sqlquery);
    		ps.setString(1, quizname+pytanie);
        	ResultSet ResultSet =  ps.executeQuery();
             
            while(ResultSet.next()) {
            	a1 = ResultSet.getString("ANSWER1");
            } 
            
        
            ResultSet.close();
            
        }
        catch (SQLException exp) {
            System.err.println(exp.getMessage());
        }
		return a1;
	}
	public String getAnswer2(int pytanie, String quizname) {
		Connection connection = null;
		String a2 = null;
		try {
        	connection = DriverManager.getConnection(url);
             
        	String sqlquery = ("SELECT * FROM QUESTIONSTABLE WHERE ID=?");
    		PreparedStatement ps = connection.prepareStatement(sqlquery);
    		ps.setString(1, quizname+pytanie);
        	ResultSet ResultSet =  ps.executeQuery();
             

            while(ResultSet.next()) {
            	a2 = ResultSet.getString("ANSWER2");
            } 
        
            ResultSet.close();
            
        }
        catch (SQLException exp) {
            System.err.println(exp.getMessage());
        }
		return a2;
	}
	public String getAnswer3(int pytanie, String quizname) {
		Connection connection = null;
		String a3 = null;
		try {
        	connection = DriverManager.getConnection(url);
             
        	String sqlquery = ("SELECT * FROM QUESTIONSTABLE WHERE ID=?");
    		PreparedStatement ps = connection.prepareStatement(sqlquery);
    		ps.setString(1, quizname+pytanie);
        	ResultSet ResultSet =  ps.executeQuery();
             

            while(ResultSet.next()) {
            	a3 = ResultSet.getString("ANSWER3");
            } 
        
            ResultSet.close();
         
        }
        catch (SQLException exp) {
            System.err.println(exp.getMessage());
        }
		return a3;
	}
	public String getCorrect(int pytanie, String quizname) {
		Connection connection = null;
		String c = null;
		try {
        	connection = DriverManager.getConnection(url);
             
        	String sqlquery = ("SELECT * FROM QUESTIONSTABLE WHERE ID=?");
    		PreparedStatement ps = connection.prepareStatement(sqlquery);
    		ps.setString(1, quizname+pytanie);
        	ResultSet ResultSet =  ps.executeQuery();
             

            while(ResultSet.next()) {
            	c = ResultSet.getString("CORRECT");
            } 
        
            ResultSet.close();
            
        }
        catch (SQLException exp) {
            System.err.println(exp.getMessage());
        }
		return c;
	}

	public void destroyDatabase() {
		try (Connection c = getConnection(url, "SA", "")) {
            c.createStatement().execute("DROP TABLE QUESTIONSTABLE");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
