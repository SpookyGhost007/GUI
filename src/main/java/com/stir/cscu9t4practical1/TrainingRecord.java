// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public String addEntry(Entry e){
        String msg = "Cannot add duplicates\n";
        if(!hasDuplicate(e))
        {
            msg = "Record added\n";
            tr.add(e);
        }
        return msg;
   } // addClass
   // look up the entry of a given day and month

    // look up the entry of a given day and month
    public String lookupEntries (String d) {
        ListIterator<Entry> iter = tr.listIterator();
        String result = "";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getLoc().equals(d))
                result += current.getEntry() + ", ";
        }
        if (result.length()==0){
            result = "No entries found";
        }
        return result;
    } // lookupEntry

    public String removeEntry(String n)
    {
        String msg = "Nothing was removed";
        ListIterator<Entry> iter = tr.listIterator();
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getProjectType().equals(n)) {
                iter.remove();
                msg = "Entry removed";
            }
        }
        return msg;
    }

    public boolean hasDuplicate(Entry e)
    {
        boolean hasDupl = false;
        ListIterator<Entry> iter = tr.listIterator();
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getProjectType().equals(e.getProjectType())) {
                hasDupl = true;
            }
        }
        return hasDupl;
    }
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord