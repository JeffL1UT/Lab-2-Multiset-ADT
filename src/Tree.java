public class Tree {

    private int root;
    private Tree[] subtrees;

    Tree(int root, Tree[] subtrees) {
        this.root = root;
        this.subtrees = subtrees.clone();
    }

    int len() {
        int size = 1;
        for (Tree subtree : this.subtrees) {
            size += subtree.len();
        }
        return size;
    }

    int count(int item) {
        // Return the occurences of <item> in this tree.
        int num = 0;
        if (this.root == item) {
            num += 1;
        }
        for (Tree subtree : this.subtrees) {
            num += count(item);
        }
        return num;
    }
}
