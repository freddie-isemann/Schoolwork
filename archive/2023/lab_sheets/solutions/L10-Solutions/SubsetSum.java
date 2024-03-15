import java.util.*;
class Instance {
    public int k;
    public List<Integer> c;

    Instance(int k, List<Integer> c) {
        this.k = k;
        this.c = c;
    }
}
class SubsetSum {
    private List<Instance> is; 

    static boolean checkInstance(Instance i) {
        Collections.sort(i.c);
        if(i.k == 1) return (i.c.get(0) == 1);
        if(!i.c.contains(1)) return false;
        for(int toAdd = 1; toAdd < i.k; toAdd++) {
            if(! ssSum(i.c.get(toAdd), i.c.subList(0, toAdd)))
                return false;
        }
        return true;
    }

    static boolean ssSum(Integer x, List<Integer> xs) {
        for(int l = 1; l <= xs.size(); l++) {
            for(Set<Integer> indices : indexSubsets(l, xs.size())) {
                if(x == sum(xs, indices))
                    return true;
            }
        }
        return false; 
    }

    static Set<Set<Integer>> indexSubsets(int l, int k) {
        if(k <= 0 || l <= 0) return null;
        if(l == 1) {
            Set<Set<Integer>> ret = new HashSet<Set<Integer>>();
            for(int i = 0; i < k; i++) {
                Set<Integer> s = new HashSet<Integer>();
                s.add(i);
                ret.add(s);
            }
            return ret; 
        }
        Set<Set<Integer>> recCall = indexSubsets(l-1, k);
        Set<Set<Integer>> ret = new HashSet<Set<Integer>>();

        for(int i = 0; i < k; i++) {
            for(Set<Integer> s : recCall) {
                if(!s.contains(i)) {
                    Set<Integer> newSet = new HashSet<Integer>(s);
                    newSet.add(i);
                    ret.add(newSet);
                }
            }
        }
        return ret;
    }

    static Integer sum(List<Integer> xs, Set<Integer> is) {
        Integer r = 0;
        for(Integer i : is) {
            r += xs.get(i);
        }
        return r;
    }

    // read the instances off of stdin
    public void readInstances() {
        Scanner scanner = new Scanner(System.in);
        int numberOfInstances = scanner.nextInt();
        
        is = new ArrayList<Instance>(numberOfInstances);

        for(int i = 1; i <= numberOfInstances; i++) {
            int k = scanner.nextInt();
            List<Integer> c = new ArrayList<Integer>(k);
            for(int j = 1; j <= k; j++) {
                c.add(j-1, scanner.nextInt());
            }
            is.add(i-1, new Instance(k, c));
        }
        scanner.close();
    }

    public List<Instance> getInstances() {
        return is;
    }
    public static void main(String[] args) {
        SubsetSum s = new SubsetSum();
        s.readInstances();
        for(Instance i : s.getInstances()) {
            System.out.println(checkInstance(i));
        }
    }
}