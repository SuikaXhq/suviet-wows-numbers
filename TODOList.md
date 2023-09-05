## 毛子API处理
- 查询所有船ID
  - https://api.wows-numbers.com/personal/rating/expected/json/
- 按名称查询玩家ID
- 按玩家ID、船ID查询当天战绩
  - 击沉数
  - 胜利数+总场次
  - 伤害（直伤+侦查）
  - 命中率（主炮、鱼雷）
  - 分all、solo、div2、div3查询以上内容

## API功能
- 以下分all、solo、div2、div3
- recent 1~30
  - 场次（每船）
  - 伤害（每船）
  - 胜率（每船）
- total
  - 同上
- 船
  - 同上
  - 命中率

## 测试记录
- SuikaXhq accoundID：2020341580
- 加贺 ship_id：3751786192
- 岛风 ship_id：4282267344

## 模块
- WowsNumbers Objects
  - WowsAccount
    - WowsShip
      - Damage, Wins, Frags, Hit Rate, etc.
- PublicAPI - 毛子API处理
  - 组织GET URL、返回原始json
  - 解析原始json，返回
- APIServer -api服务器
- DBManager - 数据库管理（存储数据+查询接口）


