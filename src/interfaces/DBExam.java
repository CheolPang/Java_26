package interfaces;

class DB {
	void run() {
		for(int i=0; i < 2; i++) {
			if(i == 1) {
				DataAccessObject run = new MySqlDao();
				run.select();
				run.insert();
				run.update();
				run.delete();
			} else {
				DataAccessObject run = new OracleDao();
				run.select();
				run.insert();
				run.update();
				run.delete();
			}
		}
	}
	
}

public class DBExam {

	public static void main(String[] args) {
		DB db = new DB();
		db.run();

	}

}
