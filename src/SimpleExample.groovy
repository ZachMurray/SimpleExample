import org.apache.tinkerpop.gremlin.structure.Graph

class SimpleExample {
    static {
        Gremlin.load()
    }
    public List exampleMethod() {
        Graph g = TinkerGraphFactory.createTinkerGraph()
        def results = []
        g.v(1).out('knows').fill(results)
        return results
    }
}