package com.example.project;

public class QueueStackTester {
 
        public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
    	recsplit(q , oq , eq , q.length() , 1);
    	}
    
    public static <T> void recsplit(Queue<T> q, Queue<T> oq, Queue<T> eq , int count , int pos){
    	 count = q.length();
    	 pos = 1;
    	
    	if(pos > count)
    		return;
    	T x = q.serve();
    	q.Enqueue(x);
    	if(pos % 2 == 1) {
    		if(!oq.full()) {
    		oq.Enqueue(x);
       
    	}}
    	else {
    		if(!eq.full()) {
    			eq.Enqueue(x);
    			
    			
    		}
    		
    	}
    	recsplit(q, oq, eq , count , pos + 1);
    	
    }
    
   public static <T> void remove(LinkedPQ<T> pq, int p)
	    { int count = pq.length();
	    LinkedPQ<T> p1 = new LinkedPQ<T>();
	    PQElement<T> tmp ;
	    for(int i = 0 ; i < count; i++) {
	    	tmp = pq.serve();
	    	if(tmp.p >= p) {
	    		
	    		p1.enqueue(tmp.data, tmp.p);
	    	}
	    	
	    }
	    int count2 = p1.length();
	    
	    
	    for(int i = 0 ; i < count2; i++) {
	    	
	    	tmp = p1.serve();
	    	
	    	
	    	pq.enqueue(tmp.data, tmp.p);
	    }
	    
		  
	    }
    public static <T> boolean search(Stack<T> st, T e){
   if(st.empty())
			 return false;
		 boolean found = false;
		 T top = st.pop();
		 if(top.equals(e))
			 found = true;
		 else {
			 found = search(st,e);
		 }
		 st.push(top);
		 return found;
    }
}




   //public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    //{
        //throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    //}
