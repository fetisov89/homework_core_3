public class ServiceStation implements ServiceTransport{
    @Override
    public void check(ServiceTransport object) {
        object.check(object);
    }
}
