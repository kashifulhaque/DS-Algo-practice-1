package kashif.dsalgo.hashmaps;

import java.util.LinkedList;

public class MyHashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int k, String v) {
        var entry = getEntry(k);
        if (entry != null) {
            entry.value = v;
            return;
        }

        getOrCreateBucket(k).add(new Entry(k, v));
    }

    public String get(int k) {
        var entry = getEntry(k);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int k) {
        var entry = getEntry(k);
        if (entry == null)
            throw new IllegalStateException();

        getBucket(k).remove(entry);
    }

    private LinkedList<Entry> getBucket(int k) {
        return entries[hash(k)];
    }

    private LinkedList<Entry> getOrCreateBucket(int k) {
        int index = hash(k);
        var bucket = entries[index];

        if (bucket == null)
            entries[index] = new LinkedList<>();

        return bucket;
    }

    private Entry getEntry(int k) {
        var bucket = getBucket(k);

        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == k) {
                    return entry;
                }
            }
        }

        return null;
    }

    private int hash(int k) {
        return Math.abs(k % entries.length);
    }

}
