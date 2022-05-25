package lecture.week12.iterator;

public class TopicIterator implements Iterator<Topic> {
    private Topic[] topics;
    private int index;

    TopicIterator(Topic[] topics) { // 현재 주어진 문제에서는 미리 Topic[] 배열을 만들어서 인자로 전달함.
        this.topics = topics;
        index = 0;
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public Topic next() {
        return topics[index++];
    }

    @Override
    public Topic currentItem() {
        return topics[index];
    }

    @Override
    public boolean hasNext() {
        return index < topics.length; // true면 index가 topic.length 범위 안에 있어서 hasNext()가 있음
    }
}
