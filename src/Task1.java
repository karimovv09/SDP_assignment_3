class Task1 {
    class LegacyOrderProcessor {
        void processLegacyOrder() {
            System.out.println("Processing order using legacy system.");
        }
    }
    interface NewOrderProcessor {
        void processNewOrder();
    }

    class OrderAdapter implements NewOrderProcessor {
        private LegacyOrderProcessor legacyOrderProcessor;

        OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
            this.legacyOrderProcessor = legacyOrderProcessor;
        }

        public void processNewOrder() {
            legacyOrderProcessor.processLegacyOrder();
        }
    }

    public void execute() {
        LegacyOrderProcessor legacyProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyProcessor);
        adapter.processNewOrder();
    }
}
