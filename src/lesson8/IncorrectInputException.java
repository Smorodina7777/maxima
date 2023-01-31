package lesson8;

public class IncorrectInputException extends RuntimeException{
    public IncorrectInputException(Exception e) {
        super("Введена точка вместо запятой в качестве разделителя знаков или введено не число: "+e.getClass()+" - "+e.getMessage());
    }
}
