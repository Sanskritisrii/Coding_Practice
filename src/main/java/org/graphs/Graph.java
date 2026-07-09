package org.graphs;
import java.util.*;

    public class Graph {
            int vertices;
            Map<Integer, List<Integer>> graph;

            Graph(int v) {

                vertices = v;
                graph = new HashMap<>();

                for (int i = 0; i < vertices; i++) {
                    graph.put(i, new ArrayList<>());
                }
            }
            void addEdge(int s, int d) {

                graph.get(s).add(d);
                graph.get(d).add(s);
            }

        
            void removeEdge(int s, int d) {

                graph.get(s).remove(Integer.valueOf(d));
                graph.get(d).remove(Integer.valueOf(s));
            }

            void printGraph() {

                System.out.println("Adjacency List:");

                for (int i = 0; i < vertices; i++) {

                    System.out.print(i + " -> ");

                    for (int x : graph.get(i)) {
                        System.out.print(x + " ");
                    }

                    System.out.println();
                }
            }

            public static void main(String[] args) {

                Graph g = new Graph(5);

                g.addEdge(0, 1);
                g.addEdge(0, 4);
                g.addEdge(1, 2);
                g.addEdge(1, 3);
                g.addEdge(1, 4);
                g.addEdge(2, 3);
                g.addEdge(3, 4);

                g.removeEdge(1, 4);

                g.printGraph();
            }
        }