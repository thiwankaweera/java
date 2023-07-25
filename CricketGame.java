import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CricketGame extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private int score;
    private int wickets;
    private boolean gameEnded;

    private Button hitButton;
    private Canvas canvas;
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) {
        score = 0;
        wickets = 0;
        gameEnded = false;

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        hitButton = new Button("Hit");
        hitButton.setOnAction(e -> performShot());

        canvas = new Canvas(WIDTH, HEIGHT);
        gc = canvas.getGraphicsContext2D();

        root.getChildren().addAll(hitButton, canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Cricket Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                draw();
            }
        };
        timer.start();
    }

    private void performShot() {
        if (!gameEnded) {
            // Perform the shot logic and update score, wickets, etc.
        }
    }

    private void draw() {
        gc.clearRect(0, 0, WIDTH, HEIGHT);

        // Draw the game elements, such as players, pitch, score, etc.
        gc.setFont(Font.font(20));
        gc.setFill(Color.BLACK);
        gc.fillText("Score: " + score, 10, 30);
        gc.fillText("Wickets: " + wickets, 10, 60);
        // ...

        if (gameEnded) {
            gc.setFont(Font.font(40));
            gc.setFill(Color.RED);
            gc.fillText("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

