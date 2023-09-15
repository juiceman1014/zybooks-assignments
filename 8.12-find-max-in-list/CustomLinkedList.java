public class CustomLinkedList {

    public static int findMax(IntNode headObj) {
        //int max
        int max = 0;
        //traverse array
        IntNode tmpNode = headObj.getNext();
        //if array is empty/null return -99
        if(tmpNode == null){
            return -99;
        }else {
            while (tmpNode != null) {
                if (tmpNode.getNodeData() > max) {
                    max = tmpNode.getNodeData();
                }
                tmpNode = tmpNode.getNext();
            }
        }
        return max;

        //else check each node for value
        //set first node value to max
        //if next node is greater than max then change max to that value
        //return max


    }

    public static void main(String[] args) {
        IntNode headObj;
        IntNode currObj;
        IntNode lastObj;
        int i;
        int max;

        // Create head node
        headObj = new IntNode(-1);
        lastObj = headObj;

        // Add nodes to the list
        for (i = 0; i < 20; ++i) {
            currObj = new IntNode(i);
            lastObj.insertAfter(currObj);
            lastObj = currObj;
        }

        max = findMax(headObj);
        System.out.println(max);
    }
}