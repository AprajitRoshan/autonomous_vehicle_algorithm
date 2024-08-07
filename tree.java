package PathTraversal;
import java.util.Scanner;
public class Trees_Implementation {

	public static treeNode<Integer>takeInput(Scanner s ){
		public static void takeInputLevelWise(treeNode <Integer>root) {
			public static treeNode<Integer> takeInputLevelWise(){
				Scanner s= new Scanner(system.in);
				System.out.println("Enter root data");
				int rootData = s.nextInt();
				QueueUsingLL<TreeNode<Integer>>pendingNodes = new QueueUsingLL<>();
				treeNode<Integer> root = new treeNode<Integer>(rootData);
				pendingNodes.enqueue(root);
				while(!pendingNodes.isEmpty()) {
					try {
						treeNode<Integer>frontNode= pendingNodes.dequeue();
						System.out.println("Enter no. of children"+ frontNode.data);
						
						int numChildren = s.nextInt();
						for(int i=0;i<numChildren;i++) {
							System.out.println("Enter" + (i+1)+ "the child of " + firstNode.data);
							
						int child= s.nextInt();
						treeNode<Integer>childNode = new treeNode<Integer>(child);
						firstNode.children.add(childNode);
						pendingNode.enqueue(childNode);
						}
					}
				catch(QueueEmptyException e) {
					//
				return NULL;
				}
				}
				return root;
			}
			public static void main(String args[]) {
				treeNode<Integer>root= takeInputLevelWise();
				print(root);
			}
		}
	}
}