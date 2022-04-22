    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    ArrayList<Integer> list=new ArrayList<Integer>();
    int i;
    
    for (i = 0; i < grades.size(); i++)
    {    
        if (grades.get(i) < 38)
        {
            list.add(grades.get(i));
        }
        else
        {
            if ((grades.get(i) + 1) % 5 == 0)
            {
                grades.set(i, (grades.get(i) + 1));
                list.add(grades.get(i));
            }
            else if ((grades.get(i) + 2) % 5 == 0)
            {
                grades.set(i, (grades.get(i) + 2));
                list.add(grades.get(i));
            }
            else
            {
                list.add(grades.get(i));
            }
        }
    }
    return (list);

    }
