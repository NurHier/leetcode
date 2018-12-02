package algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainMap = new HashMap<>();
        for (String cpDomain : cpdomains) {
            String[] cpDomainObj = cpDomain.split(" ");
            Integer domainCount = Integer.valueOf(cpDomainObj[0]);
            String[] domains = cpDomainObj[1].split("[.]");
            String domainStr = "";
            for (int i = domains.length - 1; i >= 0; i--) {
                if (!domainStr.isEmpty()) {
                    domainStr = domains[i] + "." + domainStr;
                } else {
                    domainStr = domains[i];
                }
                Integer count = domainMap.get(domainStr);
                if (count != null) {
                    domainMap.put(domainStr, count + domainCount);
                } else {
                    domainMap.put(domainStr, domainCount);
                }
            }
        }
        List<String> re = new ArrayList<>();
        for (String key : domainMap.keySet()) {
            re.add(domainMap.get(key) + " " + key);
        }
        return re;
    }

    public static void main(String[] args) {
        String[] ss = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        new SubdomainVisits().subdomainVisits(ss);
    }
}
