//Concurrentmap:
//Problem Statement: Online Voting System
//Create an Online Voting System using a ConcurrentMap where:
//Each candidate's name is stored as a key in the ConcurrentMap, and their vote count is the value.
//For example:
//ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
//Multiple threads simulate voters casting their votes for candidates concurrently.
//The program should handle:
//Adding a new candidate to the map if not already present.
//Incrementing the vote count for an existing candidate safely.
//At the end of voting, display the final vote counts for all candidates.
//
//Input Example (Simulated by Threads):
//Thread 1: Votes for "Alice"
//Thread 2: Votes for "Bob"
//Thread 3: Votes for "Alice"
//Thread 4: Adds a new candidate "Charlie" and votes for them.
//Output Example:
//Final Vote Counts:
//Alice: 2
//Bob: 1
//Charlie: 1

package Day_11;

import java.util.concurrent.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMap_voting {

    public static void main(String[] args) {
        ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(() -> {
            votes.merge("Alice", 1, Integer::sum);
        });

        executor.execute(() -> {
            votes.merge("Bob", 1, Integer::sum);
        });

        executor.execute(() -> {
            votes.merge("Alice", 1, Integer::sum);
        });

        executor.execute(() -> {
            votes.merge("Charlie", 1, Integer::sum);
        });

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Final Vote Counts:");
        votes.forEach((candidate, count) -> {
            System.out.println(candidate + ": " + count);
        });
    }
}