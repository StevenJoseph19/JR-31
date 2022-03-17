package com.monotonic.generics._1_what_and_why_of_generics;

public class CircularBuffer
{
    private final Object[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size)
    {
        buffer = new Object[size];
    }

    public boolean offer(Object value)
    {
      
        return true;
    }

    public Object poll()
    {
		return null;
		    	
    }

    private int next(int index)
    {
        return (index + 1) % buffer.length;
    }
}
