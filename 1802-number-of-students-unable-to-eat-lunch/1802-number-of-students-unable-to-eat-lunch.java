class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int countStudZero = 0, countStudOne = 0;
        
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                countStudZero++;
            } else {
                countStudOne++;
            }
        }
        
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0 && countStudZero > 0) {
                countStudZero--;
            } else if (sandwiches[i] == 1 && countStudOne > 0) {
                countStudOne--;
            } else {
                return sandwiches.length - i;
            }
        }
        
        return 0;
    }
}
