import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    private String name;
    private Node parent;
    private List<Node> childrens;

    public Node(String name) {
        this.name = name;
        this.childrens = new ArrayList<>();
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return getChildrenList(new ArrayList<>(), this);
    }

    private List<Node> getChildrenList(List<Node> temp, Node child) {
        if (child.getChildrens().isEmpty())
            return temp;
        else {
            this.childrens.forEach(e -> e.getChildrenList(temp, e));
            temp.addAll(child.childrens);
        }
        return temp;
    }

    public List<Node> getParents() {
        return getParentsList(new ArrayList<>(), this.parent);
    }

    private List<Node> getParentsList(List<Node> temp, Node parent) {
        if (parent == null)
            return temp;
        else {
            getParentsList(temp, parent.parent);
            temp.add(parent);
        }
        return temp;
    }

    public List<Node> getChildrens() {
        return childrens;
    }

    public void addChildren(Node ... newChildren) {
        Arrays.stream(newChildren).forEach(e -> e.setParent(this));
        this.childrens.addAll(Arrays.asList(newChildren));
    }

    public String getName() {
        return name;
    }
}
