package com.tnsif.task9;


	// This program demonstrates the use of the 'join()' method in Java multithreading.
	// The 'join()' method is used to wait for a thread to die.

	// The MyThread class extends Thread to create a custom thread.
	class MyThread extends Thread {
	    private String name;

	    public MyThread(String name) {
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        System.out.println(name + ": Starting task.");
	        try {
	            for (int i = 5; i > 0; i--) {
	                System.out.println(name + ": Counting down... " + i);
	                // Simulate some work by sleeping for 1 second
	                Thread.sleep(1000);
	            }
	        } catch (InterruptedException e) {
	            System.out.println(name + ": Task interrupted.");
	        }
	        System.out.println(name + ": Task completed!");
	    }
	}

	// The main class to run the program.
	public class MyThread{
	    public static void main(String[] args) {
	        System.out.println("Main thread: Starting a new thread.");

	        // Create a new thread object, passing the thread's name to the constructor.
	        MyThread t = new MyThread("Worker-Thread");

	        // Start the thread. The 'run()' method will now execute in parallel.
	        t.start();

	        System.out.println("Main thread: The new thread has been started. Waiting for it to finish...");

	        try {
	            // Use the join() method to block the main thread until 't' completes.
	            // Without this line, the "Main thread: Program finished" message would
	            // likely appear before the worker thread finishes.
	            t.join();
	        } catch (InterruptedException e) {
	            System.out.println("Main thread: Interrupted while waiting.");
	        }

	        System.out.println("Main thread: The worker thread has completed. Resuming execution.");
	        System.out.println("Main thread: Program finished.");
	    }
	}
