package main.java.com.vaneks.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
        List<Tree> trees = new ArrayList<>();
        trees.add(treeFactory.getTreeByType("Oak"));
        trees.add(treeFactory.getTreeByType("Oak"));
        trees.add(treeFactory.getTreeByType("Oak"));
        trees.add(treeFactory.getTreeByType("Oak"));
        trees.add(treeFactory.getTreeByType("Maple"));

        for(Tree tree: trees) {
            tree.draw();
        }
    }
}
