package harness;

public class BodhiXMLHarness
{
    public static class Test01
    {
        public Test01()
        {
            SQLBodhi bodhi;

            SQLDatabase database;

            SQLElement circuit01, circuit02, circuit03, circuit04;

            //

            bodhi = new SQLBodhi(database = new SQLDatabase());

            circuit01 = bodhi.addElement("//@/circuit01", circuit01 = new SQLCircuit());

            circuit02 = bodhi.addElement("//@/circuit02", circuit02 = new SQLCircuit());

            circuit03 = bodhi.addElement("//@/circuit03", circuit03 = new SQLCircuit());

            circuit04 = bodhi.addElement("//@/circuit03", circuit04 = new SQLCircuit());

            //

            circuit01.addElement("//@/circuit01/@runnable01", new SQLElement());

            circuit01.addElement("//@/circuit01/@runnable02", new SQLElement());

            circuit01.addElement("//@/circuit01/@runnable03", new SQLElement());

            //

            circuit02.addElement("//@/circuit02/@runnable01", new SQLElement());

            circuit03.addElement("//@/circuit03/@runnable01", new SQLElement());

            circuit04.addElement("//@/circuit04/@runnable01", new SQLElement());
        }

        public static class SQLCircuit extends SQLElement
        {

        }

        public static class SQLDatabase
        {

        }

        public static class SQLElement
        {
            public SQLElement()
            {

            }

            public SQLElement(SQLDatabase database)
            {

            }

            public SQLElement addElement(String s, SQLElement element)
            {
                return this;
            }

            public SQLElement addElement(SQLElement element)
            {
                return this;
            }
        }

        public static class Database
        {

        }

        public static class SQLBodhi extends SQLElement
        {
            public SQLBodhi(SQLDatabase database)
            {
                super(database);
            }

            public SQLElement addElement(String s, SQLElement element)
            {
                return null;
            }

            public SQLElement addElement(SQLElement element)
            {
                return null;
            }
        }
    }

    public static class Test02
    {
        public Test02()
        {

        }
    }

    public static class Test03
    {
        public Test03()
        {

        }
    }

    public static class Test04
    {
        public Test04()
        {

        }
    }

    public static class Test05
    {
        public Test05()
        {

        }
    }

    public static class Test06
    {
        public Test06()
        {

        }
    }
}
