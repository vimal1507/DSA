package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
		boolean result = canFinish(numCourses,prerequisites);
		System.out.println(result);

	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		List<List<Integer>> graph = new ArrayList<>();
		int[] degree = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<>());
		}
		for (int[] g : prerequisites) {
			graph.get(g[1]).add(g[0]);
			degree[g[0]]++;
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			if (degree[i] == 0)
				q.offer(i);
		}

		int completed = 0;

		while (!q.isEmpty()) {
			int course = q.poll();
			completed++;

			for (int next : graph.get(course)) {
				degree[next]--;

				if (degree[next] == 0) {
					q.offer(next);
				}
			}
		}

		return completed == numCourses;
	}

}
