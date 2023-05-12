import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Trackingsystem {
    private List<Package> packages;

    public Trackingsystem() {
        packages = new ArrayList<>();
    }

    
    public void addPackage(Package pkg) {
        packages.add(pkg);
    }

    
    public boolean removePackage(String trackingNumber) {
        for (Package pkg : packages) {
            if (pkg.getName().equals(trackingNumber)) {
                packages.remove(pkg);
                return true;
            }
        }
        return false;
    }

    
    public Package searchByRecipientAddress(String recipientAddress) {
        for (Package pkg : packages) {
            if (pkg.getSpecificationVersion().toString().equals(recipientAddress)) {
                return pkg;
            }
        }
        return null;
    }

    
    public Package searchByTrackingNumber(String trackingNumber) {
        Collections.sort(packages, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        int low = 0;
        int high = packages.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Package pkg = packages.get(mid);
            if (pkg.getName().equals(trackingNumber)) {
                return pkg;
            } else if (pkg.getName().compareTo(trackingNumber) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }


    //public List<Package> searchByCity(String city) {
       // List<Package> result = new ArrayList<>();
        //for (Package pkg : packages) {
            //if (pkg.getRecipientAddress().getCity().equals(city)) {
          //      result.add(pkg);
         //   }
        //}
        //return result;
   // }
}
