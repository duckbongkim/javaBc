package construct;

public class Construct03 {
    public static void main(String[] args){
        MemberInit member1 = new MemberInit("user1",19,50);

        MemberInit member2 = new MemberInit("user2",60);

        MemberInit[] members = {member1, member2};

        for(MemberInit m : members){
            System.out.println("이름: "+m.name+" 나이: "+m.age+" 성적: "+m.grade);
        }

    }

}
