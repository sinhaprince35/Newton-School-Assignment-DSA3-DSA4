            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left != -1) {
                arr[i].left = arr[left - 1];
            }
            if (right != -1) {
                arr[i].right = arr[right - 1];
            }
        }
        // int x= countLeafs(arr[0]);
        int x = countLeafsIterative(arr[0]);
        System.out.println(x);
    }
   public static int countLeafs(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafs(root.left) + countLeafs(root.right);
    }
    public static int countLeafsIterative(Node root) {
        if (root == null) {
            return 0;
        }
        int countLeaf = 0;
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            Node curNode = qu.remove();
            if (curNode.left != null) {
                qu.add(curNode.left);
            }
            if (curNode.right != null) {
                qu.add(curNode.right);
            }
            if (curNode.left == null && curNode.right == null) {
                countLeaf++;
            }
        }
        return countLeaf;
    }
}