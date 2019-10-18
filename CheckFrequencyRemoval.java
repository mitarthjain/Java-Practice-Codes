/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String str=sc.next();
		    if(str.length()<=2)
		    System.out.println(1);
		    else
		    {
		    Map<Character,Integer> map=new HashMap<Character,Integer>();
		    for(int i=0;i<str.length();i++)
		    {
		        char c=str.charAt(i);
		        if(map.containsKey(c))
		        {
		            int val=map.get(c);
		            map.put(c,val+1);
		        }
		        else
		        {
		            map.put(c,1);
		        }
		    }
		    int count=0,freq=0,flag=0,first_char=0,sec_freq=0,unequal=0,freq_count=0,sec_freq_count=0;
		    for(Character c: map.keySet())
		    {
		        int val=map.get(c);
		        //first_char++;
		        if(first_char==0)
		        {
		            freq=val;
		            first_char++;
		            freq_count++;
		        }
		        else
		        {
		            if(val!=freq)
		            {
		                if(unequal==0)
		                {
    		                sec_freq=val;
    		                unequal++;
    		                sec_freq_count++;
		                }
		                else if(val==sec_freq)
		                {
		                    sec_freq_count++;
		                }
		                else
		                {
		                    flag=1;
		                    break;
		                }
		            }
		            else
		            freq_count++;
		            
		        }
		        
		        }
		        if(flag==1)
		        System.out.println(0);
		        else
		        {
		            if((freq_count==0 || sec_freq_count==0))
		            System.out.println(1);
		        else if((freq_count==1 && ((freq-sec_freq)==1||freq==1)) || (sec_freq_count==1 && ((sec_freq-freq)==1||sec_freq==1)))
		        {
		           System.out.println(1);
		        }
		        else
		        System.out.println(0);
		        }
		}
		    }
		    
		}
	}
