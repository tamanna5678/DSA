public class g27treelevels{
static class treeNode{
int data;
threeNode left,right;
treeNode(int val){
data=val;
left=right=null;
}

}
public static void printlevel(treeNode root,int k){
if(root==null)return;
if(k==1){
system.out.println(root.data+"");
}else{
printlevel(root.left,k-1);
printlevel(root.right,k-1);
}
}
public static void main(String[] args){
treeNode root=new treeNode (10);
root.left=new treeNode (20);
root.right=new treeNode (30);
root.left.left=new treeNode(40);
root.left.right=new treeNode(50);
System.out.println("nodes at level 2
");
printlevel(root,2);
}
}
