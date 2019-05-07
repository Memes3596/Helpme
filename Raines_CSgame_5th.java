
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Raines_CSgame_5th extends Application {

	public static int plays = 0;
	public boolean playingGameYes;

	Pane root = new Pane();
	Scene scene = new Scene(root, 1100, 675);

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Battle Of Cast 1912!!");
		primaryStage.setScene(scene);
		new Menu();
		primaryStage.show();

		Player CoolCat = new Player(10, 10, 100, null);

		if (playingGameYes == true) {

			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent e) {

					if (e.getCode() == KeyCode.A) {

						CoolCat.setUp();
					}
				}

			});
		}
	}

	class Game {

		Text gameText = new Text();

		int i = 0;
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		
		public String[] text = new String[10];
		public String[] text1 = new String[10];
		public String[] text2 = new String[10];
		public String[] text3 = new String[10];
		public Game() {

			Intro();
		}

		public void Intro() {

			text[0] = "Welcome To Cast Tech i hope you enjoy your self.";
			text[1] = "Your first class of the day is Spainsh 2! ";
			text[2] = "You better get going you are almost late its 8:25!";
			text[3] = "Follow cast_memes";

			Image is = new Image("file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/goodmemes3.jpg");
			Image is1 = new Image(
					"file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/713039e6-7c91-4704-8877-1be252deac99.png");

			Rectangle fadeRect = new Rectangle(1100, 675);
			fadeRect.setFill(Color.BLACK);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(0.25), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeRect.setVisible(true);
			fadeout.play();

			ImageView img = new ImageView(is);
			img.setFitWidth(1100);
			img.setFitHeight(675);

			ImageView img1 = new ImageView(is1);
			img1.setFitWidth(300);
			img1.setFitHeight(300);
			img1.setTranslateX(800);

			FadeTransition fadeout2 = new FadeTransition(Duration.seconds(2), img1);
			fadeout2.setFromValue(0);
			fadeout2.setToValue(1);
			fadeout2.play();

			Rectangle bottomRect = new Rectangle(1100, 275);
			bottomRect.setFill(Color.BLACK);
			bottomRect.setOpacity(0.4);
			bottomRect.setTranslateY(400);

			gameText.setText(text[0]);
			gameText.setFill(Color.WHITE);
			gameText.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));
			gameText.setTranslateX(225);
			gameText.setTranslateY(450);

//					Rectangle charRect = new Rectangle(150, 75);
//					charRect.setFill(Color.BLACK);
//					charRect.setTranslateX(165);
//					charRect.setTranslateY(450);

			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent E) {
					if (E.getCode() == KeyCode.ENTER) {
						i++;

						gameText.setText(text[i]);
					}
					if (i == 5) {
						Gameplay();
						root.getChildren().removeAll(img, img1, bottomRect, gameText, fadeRect);
						i = 0;
					}

				}

			});
			root.getChildren().addAll(img, img1, bottomRect, gameText, fadeRect);
		}

		public void Gameplay() {

			playingGameYes = true;
			
			text1[0] = "Welcome To Cast Tech i hope you enjoy your self.";
			text1[1] = "Your first class of the day is Spainsh 2! ";
			text1[2] = "You better get going you are almost late its 8:25!";
			text1[3] = "Follow cast_memes";

			Image is = new Image("file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/goodmemes3.jpg");
			Rectangle fadeRect = new Rectangle(1100, 675);

			fadeRect.setFill(Color.BLACK);

			ImageView img = new ImageView(is);
			img.setFitWidth(1100);
			img.setFitHeight(675);
			
			Rectangle bottomRect1 = new Rectangle(1100, 275);
			bottomRect1.setFill(Color.BLACK);
			bottomRect1.setOpacity(0.4);
			bottomRect1.setTranslateY(400);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(0.35), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeout.play();
			
			Text gameText = new Text();
			gameText.setText(text[0]);
			gameText.setFill(Color.WHITE);
			gameText.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));
			gameText.setTranslateX(225);
			gameText.setTranslateY(450);
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent E) {
					if (E.getCode() == KeyCode.ENTER) {
						i1++;

						gameText.setText(text[i1]);
					}
					if (i1 == 5) {
						Gameplay();
						root.getChildren().removeAll(img, gameText, bottomRect1, fadeRect);
						i1 = 0;
					}

				}

			});
			root.getChildren().addAll(img, gameText, bottomRect1, fadeRect);
		}
		public void Gameplay1() {

			playingGameYes = true;
			
			text2[0] = "Welcome To Cast Tech i hope you enjoy your self.";
			text2[1] = "Your first class of the day is Spainsh 2! ";
			text2[2] = "You better get going you are almost late its 8:25!";
			text2[3] = "Follow cast_memes";

			Image is = new Image("file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/goodmemes3.jpg");
			Rectangle fadeRect = new Rectangle(1100, 675);

			fadeRect.setFill(Color.BLACK);

			ImageView img = new ImageView(is);
			img.setFitWidth(1100);
			img.setFitHeight(675);
			
			Rectangle bottomRect1 = new Rectangle(1100, 275);
			bottomRect1.setFill(Color.BLACK);
			bottomRect1.setOpacity(0.4);
			bottomRect1.setTranslateY(400);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(0.35), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeout.play();
			
			Text gameText = new Text();
			gameText.setText(text[0]);
			gameText.setFill(Color.WHITE);
			gameText.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));
			gameText.setTranslateX(225);
			gameText.setTranslateY(450);
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent E) {
					if (E.getCode() == KeyCode.ENTER) {
						i2++;

						gameText.setText(text[i2]);
					}
					if (i2 == 5) {
						Gameplay();
						root.getChildren().removeAll(img, gameText, bottomRect1, fadeRect);
						i2 = 0;
					}

				}

			});
			root.getChildren().addAll(img, gameText, bottomRect1, fadeRect);
		}
		public void Gameplay2() {

			playingGameYes = true;
			
			text3[0] = "Welcome To Cast Tech i hope you enjoy your self.";
			text3[1] = "Your first class of the day is Spainsh 2! ";
			text3[2] = "You better get going you are almost late its 8:25!";
			text3[3] = "Follow cast_memes";

			Image is = new Image("file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/goodmemes3.jpg");
			Rectangle fadeRect = new Rectangle(1100, 675);

			fadeRect.setFill(Color.BLACK);

			ImageView img = new ImageView(is);
			img.setFitWidth(1100);
			img.setFitHeight(675);
			
			Rectangle bottomRect1 = new Rectangle(1100, 275);
			bottomRect1.setFill(Color.BLACK);
			bottomRect1.setOpacity(0.4);
			bottomRect1.setTranslateY(400);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(0.35), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeout.play();
			
			Text gameText = new Text();
			gameText.setText(text[0]);
			gameText.setFill(Color.WHITE);
			gameText.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));
			gameText.setTranslateX(225);
			gameText.setTranslateY(450);
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent E) {
					if (E.getCode() == KeyCode.ENTER) {
						i3++;

						gameText.setText(text[i3]);
					}
					if (i3 == 5) {
						Gameplay();
						root.getChildren().removeAll(img, gameText, bottomRect1, fadeRect);
						i3 = 0;
					}

				}

			});
			root.getChildren().addAll(img, gameText, bottomRect1, fadeRect);
		}
		
	}

	class Player extends Rectangle {

		boolean isMovingUp, isMovingDown, isMovingLeft, isMovingRight;

		double h;
		String w;
//		public ImageView sprite = new ImageView(
//				new Image("C:/Users/Jr234/eclipse-workspace/VisualNovel/src/rez/loading.gif"));

		public Player(double x, double y, double health, String weapon) {

			super(x, y, 30, 30);
			this.h = health;
			this.w = weapon;
//			this.sprite.setX(this.getX());
//			this.sprite.setY(this.getY());
//			this.sprite.setFitWidth(30);
//			this.sprite.setFitWidth(30);
		}

		void move() {

			if (this.isMovingUp) {
				this.moveUp();
			} else if (this.isMovingDown) {
				this.moveDown();
			} else if (this.isMovingLeft) {
				this.moveLeft();
			} else if (this.isMovingRight) {
				this.moveRight();
			}

//			this.sprite.setX(this.getX());
//			this.sprite.setY(this.getY());
		}

		private void moveUp() {

		}

		private void moveDown() {

		}

		private void moveLeft() {

		}

		private void moveRight() {

		}

		private void setUp() {

			isMovingUp = true;
			isMovingDown = false;
			isMovingLeft = false;
			isMovingRight = false;
		}

		private void setDown() {

			isMovingUp = false;
			isMovingDown = true;
			isMovingLeft = false;
			isMovingRight = false;
		}

		private void setLeft() {

			isMovingUp = false;
			isMovingDown = false;
			isMovingLeft = true;
			isMovingRight = false;
		}

		private void setRight() {

			isMovingUp = false;
			isMovingDown = false;
			isMovingLeft = false;
			isMovingRight = true;
		}
	}

	class Menu {

		public Menu() {

			Image is = new Image(
					"file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/memed-io-output.jpeg");
			Image is1 = new Image(
					"file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/memed-io-output.jpeg");

			Text version = new Text("Ver. 9.7 and still not working");
			version.setFill(Color.WHITE);
			version.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 20));
			version.setStroke(Color.BLACK);
			version.setStrokeWidth(0.5);
			version.setTranslateX(800);
			version.setTranslateY(60);

			Rectangle fadeRect = new Rectangle(1100, 675);
			fadeRect.setFill(Color.BLACK);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(1.5), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeout.setOnFinished(evt -> {

				root.getChildren().remove(fadeRect);
			});
			fadeout.play();

			ImageView img = new ImageView(is);
			img.setFitWidth(1100);
			img.setFitHeight(675);

			ImageView img1 = new ImageView(is1);
			img1.setFitWidth(300);
			img1.setFitHeight(300);
			img1.setTranslateX(800);

			Rectangle bg = new Rectangle(1100, 200);
			bg.setFill(Color.WHITE);
			bg.setOpacity(0.4);
			bg.setTranslateY(475);

			// Rectangle mbdr = new Rectangle(200, 160);
			// mbdr.setFill(null);
			// mbdr.setStroke(Color.BLACK);
			// mbdr.setStrokeWidth(2);
			// mbdr.setTranslateX(100);
			// mbdr.setTranslateY(300);

			Rectangle hbdr = new Rectangle(50, 20);
			hbdr.setFill(null);
			hbdr.setStroke(Color.BLACK);
			hbdr.setStrokeWidth(2);
			hbdr.setTranslateX(10);
			hbdr.setTranslateY(650);

			Title title = new Title("The Battle Of CAST");
			title.setTranslateX(335);
			title.setTranslateY(100);

			MenuItem itemStart = new MenuItem("NEW GAME");
			itemStart.setTranslateX(75);
			itemStart.setTranslateY(595);

			ContinueItem contBtn = new ContinueItem("CONTINUE");
			contBtn.setTranslateX(330);
			contBtn.setTranslateY(595);

			MenuItem itemOptions = new MenuItem("OPTIONS");
			itemOptions.setTranslateX(575);
			itemOptions.setTranslateY(595);

			MenuItem itemExit = new MenuItem("EXIT");
			itemExit.setTranslateX(825);
			itemExit.setTranslateY(595);

			HelpButton helpBtn = new HelpButton("HELP");
			helpBtn.setTranslateX(10);
			helpBtn.setTranslateY(650);

			Rectangle fullScrn = new Rectangle(1100, 675);
			fullScrn.setFill(Color.BLACK);
			fullScrn.setVisible(false);

			itemExit.setOnMouseClicked(event -> System.exit(0));

			itemOptions.setOnMouseClicked(event -> System.out.println("Options: No functionality yet!"));

			helpBtn.setOnMouseClicked(event -> System.out.println("Help: No functionality yet!"));

			contBtn.setOnMouseClicked(event -> System.out.println("Not yet supported in this version of the game!"));

			itemStart.setOnMouseClicked(event -> {

				FadeTransition ft = new FadeTransition(Duration.seconds(2.5), fullScrn);
				ft.setFromValue(0);
				ft.setToValue(1);
				fullScrn.setVisible(true);

				ft.setOnFinished(evt -> {
					new LoadingScreen();
					root.getChildren().removeAll(img, img1, version, bg, title, itemStart, itemOptions, itemExit,
							contBtn, helpBtn, hbdr, fullScrn);
				});
				ft.play();
				plays++;
			});

			root.getChildren().addAll(img, img1, version, bg, title, itemStart, itemOptions, itemExit, contBtn, helpBtn,
					hbdr, fullScrn, fadeRect);
		}
	}

	class LoadingScreen {

		int loaded = 0;

		public LoadingScreen() {

			Image is = new Image("file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/gooodmems2.jpg");
			Image is1 = new Image(
					"file:///C:/Users/Abram/eclipse-workspace/Raines_CSgame_5th/src/pics/713039e6-7c91-4704-8877-1be252deac99.png");

			Rectangle fadeRect = new Rectangle(1100, 675);
			fadeRect.setFill(Color.BLACK);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(0.60), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeout.play();

			ImageView img = new ImageView(is);
			img.setFitWidth(1100);
			img.setFitHeight(675);

			ImageView img1 = new ImageView(is1);
			img1.setFitWidth(50);
			img1.setFitHeight(50);
			img1.setTranslateX(500);
			img1.setTranslateY(200);

			DropShadow dshadow = new DropShadow();
			dshadow.setOffsetY(3.0);
			dshadow.setOffsetX(3.0);
			dshadow.setColor(Color.BLACK);

//					Text text = new Text("Now Loading...");
//					text.setFill(Color.WHITE);
//					text.setEffect(dshadow);
//					text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));
//					text.setStroke(Color.BLACK);
//					text.setStrokeWidth(1);
//					text.setTranslateX(10);
//					text.setTranslateY(30);

			RotateTransition rotate = new RotateTransition(Duration.seconds(2), img1);
			rotate.setFromAngle(0);
			rotate.setToAngle(360);
			rotate.setAutoReverse(true);
			rotate.setCycleCount(4);
			rotate.setAxis(new Point3D(5, 5, 5));
			rotate.setOnFinished(evt -> {

				if (loaded == 0) {
					new ShowChapter();
					loaded++;
				}
				root.getChildren().removeAll(img, img1, fadeRect);
			});
			rotate.play();

			root.getChildren().addAll(img, img1, fadeRect);
		}
	}

	class ShowChapter {

		int chapter = 1;

		public ShowChapter() {

			Rectangle fadeRect = new Rectangle(1100, 675);
			fadeRect.setFill(Color.BLACK);

			FadeTransition fadeout = new FadeTransition(Duration.seconds(0.25), fadeRect);
			fadeout.setFromValue(1);
			fadeout.setToValue(0);
			fadeout.play();

			Rectangle rect = new Rectangle(1100, 675);
			rect.setFill(Color.BLACK);

			Text text = new Text("Before The Battle Of 1912!");
			text.setFill(Color.BLACK);
			text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));
			text.setTranslateX(475);
			text.setTranslateY(335);

			FadeTransition fadein = new FadeTransition(Duration.seconds(3), text);
			fadein.setFromValue(0);
			fadein.setToValue(1);
			text.setFill(Color.WHITE);
			fadein.setCycleCount(2);
			fadein.setAutoReverse(true);
			fadein.setOnFinished(evt -> {
				if (chapter == 1) {
					new Game();
					chapter++;
				}
				root.getChildren().removeAll(rect, text, fadeRect);
			});
			fadein.play();
			root.getChildren().addAll(rect, text, fadeRect);

		}
	}

	private static class Title extends StackPane {

		public Title(String name) {

			Rectangle bg = new Rectangle(400, 60);
			bg.setStroke(Color.BLACK);
			bg.setStrokeWidth(2);
			bg.setFill(null);

			Text text = new Text(name);
			text.setFill(Color.BLACK);
			text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 45));

			setAlignment(Pos.CENTER);
			getChildren().addAll(bg, text);
		}
	}

	private static class MenuItem extends StackPane {

		public MenuItem(String name) {

			Rectangle bg = new Rectangle(200, 40);
			bg.setFill(Color.WHITE);
			bg.setOpacity(0.2);

			Text text = new Text(name);
			text.setFill(Color.BLACK);
			text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 22));

			Rectangle b2 = new Rectangle(200, 40);
			b2.setStroke(Color.BLACK);
			b2.setStrokeWidth(2);
			b2.setFill(null);

			setAlignment(Pos.CENTER);
			getChildren().addAll(bg, text, b2);

			setOnMouseEntered(event -> {

				text.setFill(Color.RED);
			});

			setOnMouseExited(event -> {

				text.setFill(Color.BLACK);
			});

			setOnMousePressed(event -> {

				bg.setFill(Color.PINK);
			});

			setOnMouseReleased(event -> {

				bg.setFill(Color.WHITE);
			});
		}
	}

	private static class ContinueItem extends StackPane {

		public ContinueItem(String name) {

			Rectangle bg = new Rectangle(200, 40);
			bg.setFill(Color.WHITE);
			bg.setOpacity(0.2);

			Text text = new Text(name);
			text.setFill(Color.BLACK);
			text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 22));

			Rectangle b2 = new Rectangle(200, 40);
			b2.setStroke(Color.BLACK);
			b2.setStrokeWidth(2);
			b2.setFill(null);

			setAlignment(Pos.CENTER);
			getChildren().addAll(bg, text, b2);

			setOnMouseEntered(event -> {

				text.setFill(Color.RED);
			});

			setOnMouseExited(event -> {

				text.setFill(Color.BLACK);
			});

			setOnMousePressed(event -> {

				bg.setFill(Color.PINK);
			});

			setOnMouseReleased(event -> {

				bg.setFill(Color.WHITE);
			});

			setAlignment(Pos.CENTER);
		}
	}

	private static class HelpButton extends StackPane {

		public HelpButton(String name) {

			Rectangle bg = new Rectangle(50, 20);
			bg.setFill(Color.WHITE);
			bg.setOpacity(0.2);

			Text text = new Text(name);
			text.setFill(Color.BLACK);
			text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 12));

			setAlignment(Pos.CENTER);
			getChildren().addAll(bg, text);

			setOnMouseEntered(event -> {

				text.setFill(Color.DARKGREY);
			});

			setOnMouseExited(event -> {

				text.setFill(Color.BLACK);
			});

			setOnMousePressed(event -> {

				bg.setFill(Color.PINK);
			});

			setOnMouseReleased(event -> {

				bg.setFill(Color.WHITE);
			});
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
