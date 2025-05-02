import java.awt.*;
import javax.swing.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> taskList = new JList<>(model);
        JTextField taskInput = new JTextField();
        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(taskInput, BorderLayout.CENTER);
        topPanel.add(addBtn, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(removeBtn);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(taskList), BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskInput.setText("");
            }
        });

        removeBtn.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if (index != -1) {
                model.remove(index);
            }
        });

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
