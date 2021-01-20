
import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        AllNodes allNodes = new AllNodes();

        Map<String, List<Node>> nodeMap =
                allNodes.getAllNodes().stream().collect(Collectors.groupingBy(n -> n.getName().toLowerCase()));

        Object[] options1 = { "Överordnade", "Underordnade" };

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ange namn: "));
        JTextField textField = new JTextField(10);
        panel.add(textField);

        int result = JOptionPane.showOptionDialog(null, panel, "Tomteverkstad!",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options1, null);

        if (result == 1) {
            nodeMap.get(textField.getText()
                    .toLowerCase())
                    .get(0)
                    .getChildren()
                    .forEach(e -> System.out.println(e.getName()));
        } else if (result == 0) {
            nodeMap.get(textField.getText()
                    .toLowerCase())
                    .get(0)
                    .getParents()
                    .forEach(e -> System.out.println(e.getName()));
        }
    }
}