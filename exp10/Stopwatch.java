import javax.swing.*;

public class Stopwatch {
    static int elapsedSeconds = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("0", SwingConstants.CENTER);
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");

        timeLabel.setBounds(130, 30, 100, 30);
        startBtn.setBounds(30, 80, 80, 30);
        stopBtn.setBounds(120, 80, 80, 30);
        resetBtn.setBounds(210, 80, 80, 30);

        frame.setLayout(null);
        frame.setSize(330, 180);
        frame.add(timeLabel);
        frame.add(startBtn);
        frame.add(stopBtn);
        frame.add(resetBtn);

        timer = new Timer(1000, e -> {
            elapsedSeconds++;
            timeLabel.setText(String.valueOf(elapsedSeconds));
        });

        startBtn.addActionListener(e -> timer.start());
        stopBtn.addActionListener(e -> timer.stop());
        resetBtn.addActionListener(e -> {
            timer.stop();
            elapsedSeconds = 0;
            timeLabel.setText("0");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
