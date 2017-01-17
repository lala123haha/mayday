package com.example.administrator.mayday;

import java.util.List;

/**
 * Created by Administrator on 2017/1/8.
 */
public class Bean {

    /**
     * ret : true
     * data : {"trainList":[{"trainType":"高速动车","trainNo":"G2","from":"上海虹桥","to":"北京南","startTime":"09:00","endTime":"13:49","duration":"4时49分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":15},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G4","from":"上海虹桥","to":"北京南","startTime":"14:00","endTime":"18:49","duration":"4时49分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":8},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G8","from":"上海虹桥","to":"北京南","startTime":"19:00","endTime":"23:49","duration":"4时49分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":5},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G6","from":"上海虹桥","to":"北京南","startTime":"07:00","endTime":"11:55","duration":"4时55分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":9},{"seat":"二等座","seatPrice":"553","remainNum":0}]},{"trainType":"高速动车","trainNo":"G16","from":"上海虹桥","to":"北京南","startTime":"11:00","endTime":"15:55","duration":"4时55分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":15},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G18","from":"上海虹桥","to":"北京南","startTime":"15:00","endTime":"19:55","duration":"4时55分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":100},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G14","from":"上海虹桥","to":"北京南","startTime":"10:00","endTime":"14:58","duration":"4时58分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":100},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G12","from":"上海虹桥","to":"北京南","startTime":"08:00","endTime":"13:16","duration":"5时16分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":11},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G22","from":"上海虹桥","to":"北京南","startTime":"16:00","endTime":"21:17","duration":"5时17分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":100},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G24","from":"上海虹桥","to":"北京南","startTime":"17:00","endTime":"22:24","duration":"5时24分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":10},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G154","from":"上海虹桥","to":"北京南","startTime":"17:14","endTime":"22:40","duration":"5时26分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G104","from":"上海虹桥","to":"北京南","startTime":"06:53","endTime":"12:23","duration":"5时30分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":11},{"seat":"二等座","seatPrice":"553","remainNum":4},{"seat":"一等座","seatPrice":"933","remainNum":9}]},{"trainType":"高速动车","trainNo":"G106","from":"上海虹桥","to":"北京南","startTime":"07:10","endTime":"12:42","duration":"5时32分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":17},{"seat":"二等座","seatPrice":"553","remainNum":5},{"seat":"一等座","seatPrice":"933","remainNum":2}]},{"trainType":"高速动车","trainNo":"G152","from":"上海虹桥","to":"北京南","startTime":"16:19","endTime":"21:52","duration":"5时33分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G156","from":"上海虹桥","to":"北京南","startTime":"17:19","endTime":"22:52","duration":"5时33分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":19},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G44","from":"上海虹桥","to":"北京南","startTime":"17:24","endTime":"23:01","duration":"5时37分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":5},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":6}]},{"trainType":"高速动车","trainNo":"G42","from":"上海虹桥","to":"北京南","startTime":"10:28","endTime":"16:06","duration":"5时38分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":0},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":0}]},{"trainType":"高速动车","trainNo":"G102","from":"上海虹桥","to":"北京南","startTime":"06:39","endTime":"12:18","duration":"5时39分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":11},{"seat":"二等座","seatPrice":"553","remainNum":2},{"seat":"一等座","seatPrice":"933","remainNum":1}]},{"trainType":"高速动车","trainNo":"G148","from":"上海虹桥","to":"北京南","startTime":"15:31","endTime":"21:12","duration":"5时41分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":12},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G150","from":"上海虹桥","to":"北京南","startTime":"16:05","endTime":"21:48","duration":"5时43分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":100},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G146","from":"上海虹桥","to":"北京南","startTime":"15:05","endTime":"20:51","duration":"5时46分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G158","from":"上海虹桥","to":"北京南","startTime":"17:34","endTime":"23:20","duration":"5时46分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G122","from":"上海虹桥","to":"北京南","startTime":"10:46","endTime":"16:33","duration":"5时47分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":14},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":11}]},{"trainType":"高速动车","trainNo":"G116","from":"上海虹桥","to":"北京南","startTime":"09:34","endTime":"15:23","duration":"5时49分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":8},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":19}]},{"trainType":"高速动车","trainNo":"G160","from":"上海虹桥","to":"北京南","startTime":"17:39","endTime":"23:28","duration":"5时49分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G118","from":"上海虹桥","to":"北京南","startTime":"09:54","endTime":"15:44","duration":"5时50分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":10},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G124","from":"上海虹桥","to":"北京南","startTime":"11:05","endTime":"16:55","duration":"5时50分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":9},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":3}]},{"trainType":"高速动车","trainNo":"G108","from":"上海虹桥","to":"北京南","startTime":"07:20","endTime":"13:11","duration":"5时51分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":10},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":14}]},{"trainType":"高速动车","trainNo":"G134","from":"上海虹桥","to":"北京南","startTime":"13:02","endTime":"18:53","duration":"5时51分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G136","from":"上海虹桥","to":"北京南","startTime":"13:17","endTime":"19:08","duration":"5时51分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":13},{"seat":"二等座","seatPrice":"553","remainNum":6},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G120","from":"上海虹桥","to":"北京南","startTime":"10:05","endTime":"15:59","duration":"5时54分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":17},{"seat":"二等座","seatPrice":"553","remainNum":1},{"seat":"一等座","seatPrice":"933","remainNum":4}]},{"trainType":"高速动车","trainNo":"G138","from":"上海虹桥","to":"北京南","startTime":"13:30","endTime":"19:24","duration":"5时54分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":100},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":10}]},{"trainType":"高速动车","trainNo":"G140","from":"上海虹桥","to":"北京南","startTime":"13:37","endTime":"19:31","duration":"5时54分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":6},{"seat":"二等座","seatPrice":"553","remainNum":13},{"seat":"一等座","seatPrice":"933","remainNum":8}]},{"trainType":"高速动车","trainNo":"G144","from":"上海虹桥","to":"北京南","startTime":"14:35","endTime":"20:29","duration":"5时54分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":14},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":8}]},{"trainType":"高速动车","trainNo":"G130","from":"上海虹桥","to":"北京南","startTime":"11:26","endTime":"17:23","duration":"5时57分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":9},{"seat":"二等座","seatPrice":"553","remainNum":5},{"seat":"一等座","seatPrice":"933","remainNum":10}]},{"trainType":"高速动车","trainNo":"G110","from":"上海虹桥","to":"北京南","startTime":"07:28","endTime":"13:26","duration":"5时58分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":18},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G128","from":"上海虹桥","to":"北京南","startTime":"11:15","endTime":"17:13","duration":"5时58分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":16},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":9}]},{"trainType":"高速动车","trainNo":"G114","from":"上海虹桥","to":"北京南","startTime":"08:10","endTime":"14:12","duration":"6时2分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":19},{"seat":"二等座","seatPrice":"553","remainNum":1},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G142","from":"上海虹桥","to":"北京南","startTime":"14:16","endTime":"20:18","duration":"6时2分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":11},{"seat":"二等座","seatPrice":"553","remainNum":100},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G112","from":"上海虹桥","to":"北京南","startTime":"08:05","endTime":"14:08","duration":"6时3分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":10},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]},{"trainType":"高速动车","trainNo":"G412","from":"上海虹桥","to":"北京南","startTime":"12:23","endTime":"18:31","duration":"6时8分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"动车组","trainNo":"D314","from":"上海","to":"北京南","startTime":"21:08","endTime":"08:55","duration":"11时47分","seatInfos":[{"seat":"二等座","seatPrice":"309","remainNum":0},{"seat":"软卧","seatPrice":"615","remainNum":100}]},{"trainType":"动车组","trainNo":"D322","from":"上海","to":"北京南","startTime":"19:53","endTime":"07:45","duration":"11时52分","seatInfos":[{"seat":"二等座","seatPrice":"309","remainNum":0},{"seat":"软卧","seatPrice":"615","remainNum":100}]},{"trainType":"动车组","trainNo":"D312","from":"上海","to":"北京南","startTime":"19:10","endTime":"07:07","duration":"11时57分","seatInfos":[{"seat":"软卧","seatPrice":"615","remainNum":-1},{"seat":"软卧","seatPrice":"696","remainNum":-1},{"seat":"二等座","seatPrice":"309","remainNum":-1}]},{"trainType":"空调特快","trainNo":"T110","from":"上海","to":"北京","startTime":"18:02","endTime":"09:30","duration":"15时28分","seatInfos":[{"seat":"高级软卧","seatPrice":"879.5","remainNum":4},{"seat":"无座","seatPrice":"177.5","remainNum":100},{"seat":"硬座","seatPrice":"177.5","remainNum":0},{"seat":"硬卧","seatPrice":"304.5","remainNum":0},{"seat":"软卧","seatPrice":"476.5","remainNum":0}]},{"trainType":"其他","trainNo":"1462","from":"上海","to":"北京","startTime":"12:18","endTime":"10:46","duration":"22时28分","seatInfos":[{"seat":"无座","seatPrice":"156.5","remainNum":1},{"seat":"硬座","seatPrice":"156.5","remainNum":0},{"seat":"硬卧","seatPrice":"283.5","remainNum":0},{"seat":"软卧","seatPrice":"455.5","remainNum":0}]}]}
     */

    private boolean ret;
    private DataBean data;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<TrainListBean> trainList;

        public List<TrainListBean> getTrainList() {
            return trainList;
        }

        public void setTrainList(List<TrainListBean> trainList) {
            this.trainList = trainList;
        }

        public static class TrainListBean {
            /**
             * trainType : 高速动车
             * trainNo : G2
             * from : 上海虹桥
             * to : 北京南
             * startTime : 09:00
             * endTime : 13:49
             * duration : 4时49分
             * seatInfos : [{"seat":"商务座","seatPrice":"1748","remainNum":15},{"seat":"二等座","seatPrice":"553","remainNum":0},{"seat":"一等座","seatPrice":"933","remainNum":100}]
             */

            private String trainType;
            private String trainNo;
            private String from;
            private String to;
            private String startTime;
            private String endTime;
            private String duration;
            private List<SeatInfosBean> seatInfos;

            public String getTrainType() {
                return trainType;
            }

            public void setTrainType(String trainType) {
                this.trainType = trainType;
            }

            public String getTrainNo() {
                return trainNo;
            }

            public void setTrainNo(String trainNo) {
                this.trainNo = trainNo;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {
                this.from = from;
            }

            public String getTo() {
                return to;
            }

            public void setTo(String to) {
                this.to = to;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public List<SeatInfosBean> getSeatInfos() {
                return seatInfos;
            }

            public void setSeatInfos(List<SeatInfosBean> seatInfos) {
                this.seatInfos = seatInfos;
            }

            public static class SeatInfosBean {
                /**
                 * seat : 商务座
                 * seatPrice : 1748
                 * remainNum : 15
                 */

                private String seat;
                private String seatPrice;
                private int remainNum;

                public String getSeat() {
                    return seat;
                }

                public void setSeat(String seat) {
                    this.seat = seat;
                }

                public String getSeatPrice() {
                    return seatPrice;
                }

                public void setSeatPrice(String seatPrice) {
                    this.seatPrice = seatPrice;
                }

                public int getRemainNum() {
                    return remainNum;
                }

                public void setRemainNum(int remainNum) {
                    this.remainNum = remainNum;
                }
            }
        }
    }
}
