package class1.construct;

public class Construct02 {
    public static void main(String[] args){
        MemberInit member1 = new MemberInit("user1",19,50);
            //initMember(member1, "user1", 19, 50);
            //member1.MemberInit("user1",19,50);
        MemberInit member2 = new MemberInit("user2",20,60);
        //initMember(member2, "user2", 20, 60);
            //member2.MemberInit("user2",50,10);
        MemberInit[] members = {member1, member2};

        for(MemberInit m : members){
            System.out.println("이름: "+m.name+" 나이: "+m.age+" 성적: "+m.grade);
        }

    }

}
