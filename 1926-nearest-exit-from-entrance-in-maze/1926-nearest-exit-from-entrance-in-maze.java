class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int steps = -1;
        // BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            steps++;
            int size = queue.size();
            // Pop current level from the queue
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] direction : directions) {
                    int nextR = current[0] + direction[0];
                    int nextC = current[1] + direction[1];

                    // Check if within bounds and not visited
                    if (nextR >= 0 && nextC >= 0 && nextR < maze.length && nextC < maze[0].length
                            && maze[nextR][nextC] == '.' && !visited[nextR][nextC]) {

                        // Check if we have reached an exit (but not the entrance)
                        if (nextR == 0 || nextC == 0 || nextR == maze.length - 1 || nextC == maze[0].length - 1) {
                            if (nextR != entrance[0] || nextC != entrance[1]) {
                                return steps + 1;
                            }
                        }

                        visited[nextR][nextC] = true;
                        queue.offer(new int[]{nextR, nextC});
                    }
                }
            }
        }

        return -1; 
    }
}
