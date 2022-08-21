class Solution {
    public int minimumOneBitOperations(int n) {
        return calc(calculateOneIndex(n));
    }
    
    private int calc(LinkedList<Integer> indices) {
        if (indices.isEmpty()) {
            return 0;
        }
        int index = indices.removeLast();
        return stepOfExp(index) - calc(indices);
    }
    
    
    private LinkedList<Integer> calculateOneIndex(int n) {
        LinkedList<Integer> result = new LinkedList<>();
        int index = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result.add(index);
            }
            n >>= 1;
            
            index++;
        }
        return result;
    }
    
    private int stepOfExp(int index) {
        int result = 1;
        while (index > 0) {
            result <<= 1;
            index--;
        }
        return result - 1;
    }
}