package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Users;

public class LoginController {

	
		@FXML
		
		TextField usuario;
		
		TextField contraseña;

		private Main main;
		
		private Users users;
		
		public void entrarBT() {
			
			main.ShowCalculator();
			

		}
		
		public void setMain(Main main) {
			
			this.main = main;
		}
		
		public void setUsers(Users users) {
			this.users = users;
		}

}
