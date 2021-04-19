package entities;

public class Response<T> {
    private T data;
    private String message;
    private String status;

    public Response(T data, String message, String status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }
    
    @Override
    public String toString() {
        return String.format("{data :{ message: %s },  message: %s,  status: %s} ", this.data.toString(), this.message, this.status);
    }

}

