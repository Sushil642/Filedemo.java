import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FILEDETAILS {
	public static void p(String str) {
        System.out.println(str);
    }

    public static void analyze(String s) {
        System.out.println("FILE IS:");
        File f = new File(s);
        if (f.exists()) {
            p(f.getName() + "is a file");
            p(f.canRead() ?"is readable" : "is not readable");
            p(f.canWrite() ?"is Writeable" : "is not Writeable");
            p("File size" + f.length() + "bytes");
            p("file last modifies" + f.lastModified());
        } else {
            System.out.println("file doesnt exists");
        }
        if (f.isDirectory()) {
            p(f.getName() + "is directory");
            p("List of files");
            String dir[] = f.list();
            for (int i = 0; i < dir.length; i++) {
                p(dir[i]);
            }
        }
       }
    }

    public class filedemo
    {
    	public static void main(String rr[]) throws IOException
        {
        	FILEDETAILS fd= new FILEDETAILS();
            Scanner sc = new Scanner(System.in);
            System.out.println("ENter file name");
            String s1 = sc.next();
            System.out.println(s1);
            fd.analyze(s1);
          }
        }
