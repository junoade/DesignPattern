package lecture.week12.iterator;

public class TopicList implements List<Topic> {
    private Topic[] topics;

    TopicList(Topic[] topics){ // 현재 주어진 문제에서는 미리 Topic[] 배열을 만들어서 인자로 전달함.
        this.topics = topics;
    }
    @Override
    public Iterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}
