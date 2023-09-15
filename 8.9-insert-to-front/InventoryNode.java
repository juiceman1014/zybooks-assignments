public class InventoryNode {
    private String item;
    private int numberOfItems;
    private InventoryNode nextNodeRef; // Reference to the next node
    private InventoryNode tmpNode;

    public InventoryNode() {
        item = "";
        numberOfItems = 0;
        nextNodeRef = null;
    }

    // Constructor
    public InventoryNode(String itemInit, int numberOfItemsInit) {
        this.item = itemInit;
        this.numberOfItems = numberOfItemsInit;
        this.nextNodeRef = null;
    }

    // Constructor
    public InventoryNode(String itemInit, int numberOfItemsInit, InventoryNode nextLoc) {
        this.item = itemInit;
        this.numberOfItems = numberOfItemsInit;
        this.nextNodeRef = nextLoc;
    }

    // TODO: Define an insertAtFront() method that inserts a node at the
    //        front of the linked list (after the dummy head node)
    public void insertAtFront(InventoryNode headNode, InventoryNode currNode){

        if (currNode != null) {
            currNode.setNextNode(headNode.getNext());
            headNode.setNextNode(currNode);
        }

    }


    // Get location pointed by nextNodeRef
    public InventoryNode getNext() {
        return this.nextNodeRef;
    }

    public void setNextNode(InventoryNode nextNodeRef){
        this.nextNodeRef = nextNodeRef;
    }

    // Print node data
    public void printNodeData() {
        System.out.println(this.numberOfItems + " " + this.item);
    }
}
