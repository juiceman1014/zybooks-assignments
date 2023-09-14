import java.util.Scanner;

public class MileageTrackerLinkedList {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        // References for MileageTrackerNode objects
        MileageTrackerNode headNode;
        MileageTrackerNode currNode;
        MileageTrackerNode tailNode;

        double miles;
        String date;
        int i = 0;

        headNode = null;
        currNode = null;
        tailNode = null;

        // TODO: Scan the number of nodes
        int numberNodes = scnr.nextInt();

        // TODO: For the scanned number of nodes, scan
        //       in data and insert into the linked list
        while(i < numberNodes){
            double userMiles = scnr.nextDouble();
            String userDate = scnr.next();
            MileageTrackerNode newNode = new MileageTrackerNode(userMiles, userDate);

            if(headNode == null){
                headNode = newNode;
                tailNode = newNode;
            }else{
                tailNode.insertAfter(newNode);
                tailNode = newNode;
            }
            i++;
        }


        // TODO: Call the printNodeData() method
        //       to print the entire linked list
        currNode = headNode;
        while(currNode != null){
            currNode.printNodeData();
            currNode = currNode.getNext();
        }
    }
}