

// class Solution {
 
    
//     // Function to convert a binary tree into its mirror tree.
//     void mirror(Node node) {
//         if (node == null) {
//             return; // Base case: if the node is null, do nothing
//         }
        
//         // Swap the left and right subtrees of the current node
//         Node temp = node.left;
//         node.left = node.right;
//         node.right = temp;
        
//         // Recursively call the mirror function for the left and right subtrees
//         mirror(node.left);
//         mirror(node.right);
//     }
// }




class Solution {

  
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {


        if(node==null){
            return;
        }


        Node temp=node.left;
        node.left=node.right;
        node.right=temp;

        mirror(node.left);
        mirror(node.right);
        // Your code here
    }
}

