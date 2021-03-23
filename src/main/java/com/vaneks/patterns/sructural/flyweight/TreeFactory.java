package main.java.com.vaneks.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> trees = new HashMap<>();
    public Tree getTreeByType(String type) {
        Tree tree = trees.get(type);

        if(tree == null) {
            switch (type) {
                case "Oak":
                    System.out.println("Create Oak");
                    tree = new Oak();
                    break;
                case "Maple":
                    System.out.println("Create Maple");
                    tree = new Maple();
                    break;
            }
            trees.put(type, tree);
        }
        return tree;
    }
}
