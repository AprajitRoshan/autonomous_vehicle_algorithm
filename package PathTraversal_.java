import java.util.Scanner;

public class TreeUse{

public static TreeNode<Integer> takeInput(Scanner s) { 
    public static void print (TreeNode<Integer> root) {
        public static TreeNode<Integer> takeInputLevelWise(){
            Scanner s = new Scanner(system.in); 
            System.out.println("Enter root data");
             int rootData = s.nextInt ();
             QueneUsingLL<TreeNode<Integer>> pendingNodes = newQueueUsingLL();
             TreeNode<Integer> root = new TreeNode<Integer> (rootData);
             pendingNodes.enqueue(root);
             while (!pendingNodes.isEmpty ()){
                try{
                    TreeNode<Integer> frontNode = pendingNodes.dequeue();
                    System.out.println("Enternum of children of "+frontNode.data);
                    int numChildren=s.nextInt();
                    for(int i=0;i<numChildren;i++){
                        System.out.println("Enter"+(i+1)+"th child of"+ frontNode.data);
                        int child=s.nextInt();
                        TreeNode<Integer>childNode=new TreeNode<Integer>(child);
                        frontNode.children.add(childNode);
                        pendingNodes.enqueue(childNode);
                    }
                }
                catch(QueueEmptyException e){
                    //Shouldn't come here
                    return null;
                }
            }
            return root;
        }
        public static void main(String[]args){
            TreeNode<Integer>root=takeInputLevelWise();
            print (root);
        }
    }
}