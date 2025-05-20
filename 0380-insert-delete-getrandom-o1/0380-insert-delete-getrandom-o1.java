class RandomizedSet {
    ArrayList<Integer>list;
    HashMap<Integer,Integer>mp;
    Random random=new Random();

    public RandomizedSet() {
        list=new ArrayList<>();
        mp=new HashMap<>();

    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val))
        return false;
        mp.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val))
        return false;
        int pos=mp.get(val);
        int lastel=list.get(list.size()-1);
        list.set(pos,lastel);//change the location of last el.
        mp.put(lastel,pos);//update the new location in loc stored map

        list.remove(list.size()-1);//now remove the extra last el becuse it store in diff loc
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randinx=random.nextInt(list.size());
        return list.get(randinx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */