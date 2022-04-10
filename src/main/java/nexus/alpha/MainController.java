package nexus.alpha;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ProgressBar testBar;

	@FXML
	private Label timeField;

	private void timeNow() {
		Thread thread = new Thread(() -> {
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				String timeNow = sdf.format(new Date());
				Platform.runLater(() -> {
					timeField.setText(timeNow);
				});
			}
		});
		thread.start();
	}
	
	private void progress() {
		Thread thread = new Thread(() -> {
			
		});
	}

	@FXML
	void initialize() {

		timeNow();
	}
}
