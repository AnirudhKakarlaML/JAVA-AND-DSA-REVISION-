import java.util.PriorityQueue;

// LC 1102 - Path With Maximum Minimum Value
// Go from (0,0) to (m-1,n-1) moving up/down/left/right.
// A path's score = smallest value on it. Return the max possible score.
//
// Idea: always expand the cell with the biggest value next (max-heap).
// Track the smallest value seen so far; when we reach the end, that is the answer.
// Time: O(m*n log(m*n)), Space: O(m*n)
public class LC1102_PathWithMaximumMinimumValue {
    class Solution {
        public int maximumMinimumPath(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            boolean[][] visited = new boolean[m][n];

            // {value, row, col}, biggest value on top
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            pq.offer(new int[]{grid[0][0], 0, 0});
            visited[0][0] = true;

            int ans = grid[0][0];
            while (!pq.isEmpty()) {
                int[] cur = pq.poll();
                ans = Math.min(ans, cur[0]);
                int r = cur[1], c = cur[2];
                if (r == m - 1 && c == n - 1) {
                    return ans;
                }
                for (int[] d : dirs) {
                    int nr = r + d[0], nc = c + d[1];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        pq.offer(new int[]{grid[nr][nc], nr, nc});
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new LC1102_PathWithMaximumMinimumValue().new Solution();
        System.out.println(s.maximumMinimumPath(new int[][]{{5, 4, 5}, {1, 2, 6}, {7, 4, 6}})); // 4
        System.out.println(s.maximumMinimumPath(new int[][]{{2, 2, 1, 2, 2, 2}, {1, 2, 2, 2, 1, 2}})); // 2
        System.out.println(s.maximumMinimumPath(new int[][]{
            {3, 4, 6, 3, 4}, {0, 2, 1, 1, 7}, {8, 8, 3, 2, 7}, {3, 2, 4, 9, 8},
            {4, 1, 2, 0, 0}, {4, 6, 5, 4, 3}})); // 3
    }
}
